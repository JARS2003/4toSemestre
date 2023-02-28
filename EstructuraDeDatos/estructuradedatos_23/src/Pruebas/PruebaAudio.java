package Pruebas;

import entradaSalida.SalidaPorDefecto;
import utilerias.archivosAudio.AudioFileRecord;

public class PruebaAudio {
    public static void main(String[] args) {
        AudioFileRecord audio = new AudioFileRecord("C:\\Users\\jarsr\\Downloads\\audio\\archivo.wav");
        /*AudioFileRecord audioA = new AudioFileRecord("C:\\Users\\jarsr\\Downloads\\audio\\A.wav");
        AudioFileRecord audioE = new AudioFileRecord("C:\\Users\\jarsr\\Downloads\\audio\\E.wav");
        AudioFileRecord audioI = new AudioFileRecord("C:\\Users\\jarsr\\Downloads\\audio\\I.wav");
        AudioFileRecord audioO = new AudioFileRecord("C:\\Users\\jarsr\\Downloads\\audio\\O.wav");
        AudioFileRecord audioU = new AudioFileRecord("C:\\Users\\jarsr\\Downloads\\audio\\U.wav");
        AudioFileRecord vocalComparar = new AudioFileRecord("C:\\Users\\jarsr\\Downloads\\audio\\vocal.wav");
        audioA.leerAudio();
        audioE.leerAudio();
        audioI.leerAudio();
        audioO.leerAudio();
        audioU.leerAudio();
        vocalComparar.leerAudio();
        SalidaPorDefecto.terminal("Vocal A: "+ vocalComparar.energiaVocal());
        SalidaPorDefecto.terminal("\nVocal A;"+audioA.energiaVocal()+"\nVocal E;"+audioE.energiaVocal()+"\nVocal I;"+audioI.energiaVocal()+
                "\nVocal O;"+audioO.energiaVocal()+"\nVocal U;"+audioU.energiaVocal());*/
        //audio.preEnfasis();
        //audio.EscribirAudio(audio.getBuffer2());
        //audio.bajarVolumen(10);
        //audio.EscribirAudio(audio.getBuffer2());
        //audio.EscribirAudio(audio.acelerarAudio(2));
        //audio.invertirX();
       // audio.EscribirAudio(audio.getBuffer2());
        //audio.invertirY();
        //audio.EscribirAudio(audio.getBuffer2());
        //audio.EscribirAudio(audio.alentar(2));
        audio.leerAudio();
        audio.EscribirAudio(audio.eliminarSilencio());






    }
}
