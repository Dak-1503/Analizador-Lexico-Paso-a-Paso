package codigo;

import java.io.File;

public class Principal {
    public static void main(String[] args) {
        String ruta = "C:/Users/danie/OneDrive/Documentos/ITES/SEMESTRES/SEMESTRE 6/3. Lenguajes y Autómatas 1/Unidad 4/Analizador Léxico paso a paso/AnalizadorLexico/src/codigo/Lexer.flex";
        generarLexer(ruta);
    }
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
}
