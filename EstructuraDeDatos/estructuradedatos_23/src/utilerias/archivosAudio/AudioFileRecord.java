package utilerias.archivosAudio;

import entradaSalida.SalidaPorDefecto;
import estructuraslineales.ListaEstaticaNumerica;
import utilerias.archivosAudio.wavfile.WavFile;

import java.io.*;
import java.nio.Buffer;


public class AudioFileRecord {
    private long numFrames;  //numero de tramas, número de muestras totales del archivo por canal
    private long sampleRate; //numero de muestras por segundo a la que se discretiza la señal
    private int numChannels; //número de canales
    private double[] buffer; //audio original
    private ListaEstaticaNumerica buffer2; //audio modificado
    private String archivo;   //nombre de archivo dado por el usuario
    private WavFile wavFileR; //apuntador de archivo leido
    private WavFile wavFileW;  //apuntador de archivo a escribir
    private String nomArchivo; //nombre archivo (uno.wav)
    private String nomRuta;    //ruta donde esta guardado el archivo (/home)
    private int validBits;     //bits usados para la discretización

    public AudioFileRecord(String archivo) {
        this.archivo = archivo;
        // Abre el archivo wav y asigna parámetros a las variables
        try {
            File file = new File(archivo);
            wavFileR = WavFile.openWavFile(file);
            nomArchivo = file.getName();
            nomRuta = file.getParent();
        } catch (Exception e) {

        }
        numChannels = wavFileR.getNumChannels();
        numFrames = wavFileR.getNumFrames();
        sampleRate = wavFileR.getSampleRate();
        validBits=wavFileR.getValidBits();
    }

    /**
     * Este metodo lee un audio y lo convierte a lista.
     */
    public void leerAudio() {
        try {

            // Muestra datos del archivo
            wavFileR.display();

            // Crea buffer de origen y de temporal
            buffer = new double[(int) numFrames * numChannels];
            buffer2 = new ListaEstaticaNumerica(buffer.length);

            //tramas leidas
            int framesRead;

            // Lee tramas totales
            framesRead = wavFileR.readFrames(buffer, (int) numFrames);

            // Recorrer todas las tramas del archivo y guardarlas en el arreglo.
            buffer2.copiarBufer(buffer);

            // Cierra archivo
            wavFileR.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    /**
     * Escribe un audio con las caracteristicas especificadas.
     * @param lista Contiene los valores para representar el audio.
     */
    public void EscribirAudio(ListaEstaticaNumerica lista) {
        try {

            //Crear el apuntador al archivo para guardar datos del temporal
            File file = new File(nomRuta + "/2_" + nomArchivo);

            // Creamos un nuevo archivo de audio con los mismos datos que el original
            wavFileW = WavFile.newWavFile(file, numChannels, numFrames, validBits, sampleRate);

            // Escribimos los frames o muestras totales del temporal
            wavFileW.writeFrames(lista.leerArregloNum(), (int) numFrames);

            // Cerramos el archivo
            wavFileW.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    /**
     * Este metodo aplica un filtro FIR de primer oreden en las altas frecuencias.
     */
    public void preEnfasis(){
        for(int indiceArreglo = 1; indiceArreglo < buffer2.getMAXIMO(); indiceArreglo++){
            buffer2.cambiar(indiceArreglo, (double) buffer2.obtener(indiceArreglo) + (0.97 * (double) buffer2.obtener(indiceArreglo - 1)));
        }

    }

    /**
     * Este metodo sube el volumen a un audio.
     * @param intensidad Es la intensidad con la que se va a subir el volumen audio.
     */
    public void subirVolumen(int intensidad){
        buffer2.porEscalar(intensidad);

    }
    /**
     * Este metodo baja el volumen a un audio.
     * @param intensidad Es la intensidad con la que se va bajar el  volumen del audio.
     */
    public void bajarVolumen(int intensidad){
        buffer2.porEscalar((double)1/intensidad);

    }

    /**
     * Este metodo acelea la velocidad del audio
     * @param aceleracion Es la velocidad del auidio.
     * @return Regresa una ListaEstaticaNumerica con los valores que hacen posible la aceleracion.
     */
    public ListaEstaticaNumerica acelerarAudio(int aceleracion){
        ListaEstaticaNumerica audioAcelerado = new ListaEstaticaNumerica(buffer2.getMAXIMO()/aceleracion);
        for(int indiceArreglo = 0; indiceArreglo < buffer2.getTope(); indiceArreglo = indiceArreglo+aceleracion){
            audioAcelerado.agregar(((double) buffer2.obtener(indiceArreglo) + (double) buffer2.obtener(indiceArreglo + 1))/2);
        }
        return audioAcelerado;


    }

    public ListaEstaticaNumerica getBuffer2() {
        return buffer2;
    }

    /**
     * Este metodo invierte  el eje x, lo que esta primero al ultimo
     * lo que esta al ultimo primero.
     */
    public void invertirX(){
        buffer2.invertir();
    }

    /**
     * Este metodo invierte  el eje y, lo que esta arriba en la parte de abajo
     * lo que esta al abajo en la parte de arriba.
     */
    public void invertirY(){
        buffer2.porEscalar(-1);

    }
    /**
     * Este metodo alenta la velocidad del audio
     * @param alentar Es la velocidad del auidio a la que se va alentar.
     * @return Regresa una ListaEstaticaNumerica con los valores que hacen posible la aceleracion.
     */

    public ListaEstaticaNumerica alentar(int alentar){
        int tamanio = buffer2.getMAXIMO()*alentar;
        ListaEstaticaNumerica audioLento  = new ListaEstaticaNumerica(tamanio);
        for(int indiceArreglo = 0; indiceArreglo < buffer2.getTope(); indiceArreglo++){

            audioLento .agregar(buffer2.obtener(indiceArreglo));
            for(int indiceAlentador = 0; indiceAlentador < alentar; indiceAlentador++){
                audioLento .agregar(((double) buffer2.obtener(indiceArreglo) + (double) buffer2.obtener(indiceArreglo + 1))/2);
            }

        }
        return audioLento ;



    }

    /**
     * Elimina las partes en lasz que no hay sonido.
     */
    public ListaEstaticaNumerica eliminarSilencio(){
            ListaEstaticaNumerica listanueva = new ListaEstaticaNumerica(buffer2.getMAXIMO());
            for (int indiceArreglo = 0; indiceArreglo < buffer2.getMAXIMO(); indiceArreglo++) {
                double objeto = (double) buffer2.obtener(indiceArreglo);
                if (objeto>0.001||objeto<-0.001) {
                        listanueva.agregar(objeto);
                }
            }
            return listanueva;
        }


    /**
     * Mide la enerfia de cada vocal
     * @return
     */
    public double energiaVocal(){
        double energia = buffer2.productoEscalar(buffer2);
        return energia;
    }
}
