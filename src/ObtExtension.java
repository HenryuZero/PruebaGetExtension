import java.io.File;
import java.net.Socket;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ObtExtension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nombre del archivo: ");
        String archivoLeer = in.nextLine();
        File file = new File(archivoLeer);
        probarExtension(file);

    }

    public static void probarExtension(File file){
        String archivo= file.toString();
        System.out.println(archivo);
        int index = archivo.lastIndexOf('.');
        if(index > 0) {
            String extension = archivo.substring(index + 1);
            System.out.println("File extension is " + extension);
        }
    }

  /*
   En el main
   System.out.println("Nombre del archivo txt a leer: ");
   String archivoLeer = in.nextLine();
   muestraContenido(archivoLeer);

   public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            System.out.println(cadena);
        }
        b.close();
    }*/
/*
* public static Optional<String> findExtension(String fileName) {
    int lastIndex = fileName.lastIndexOf('.');
    if (lastIndex == -1) {
        return Optional.empty();
    }
    return Optional.of(fileName.substring(lastIndex + 1));
}
*
* public Optional<String> getExtensionByStringHandling(String filename) {
    return Optional.ofNullable(filename)
      .filter(f -> f.contains("."))
      .map(f -> f.substring(filename.lastIndexOf(".") + 1));
}
*
* public class GetFileExtensionExample {
 private static String getFileExtension(File file) {
  String fileName = file.getName();
  if (fileName.lastIndexOf('.') != -1 && fileName.lastIndexOf('.') != 0) {
   return fileName.substring(fileName.lastIndexOf('.') + 1);
  } else {
   return "File don't have extension";
  }
 }

 public static void main(String[] args) {
  File file = new File("sample.txt");
  System.out.println(getFileExtension(file));

  File file1 = new File("sample");
  System.out.println(getFileExtension(file1));

  File file2 = new File("sample.docx");
  System.out.println(getFileExtension(file2));

 }

}
*
* */

}
