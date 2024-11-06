import java.io.File;

public class RenombrarDirectorios {

    public void RenombrarDirectorios(String path){
        //validar que el path sea un directorio
        File directorio = new File(path);
        if(!directorio.exists() || !directorio.isDirectory()){
            System.out.println("La ruta path no es un directorio");
            return;
        }
        //Aca vamos a cambiar los nombres de los directorios

        //System.out.println("La  ruta path es valida");
        RenombrarDirectoriosInternos(directorio);
    }

    public void RenombrarDirectoriosInternos(File directorio){
        //Listar todos los archivos y/o carpetas hijas
        File[] archivosInternos = directorio.listFiles();
        if(archivosInternos == null){
            return;
        }
        for(File directorioArchivo : archivosInternos){
            if(directorioArchivo.isDirectory()){ //si es carpeta cambio nombre
                String nombreCarpeta = directorioArchivo.getName();
                String nombreNuevo = "Prueba-" + nombreCarpeta;
                File nuevoDirectorio = new File(directorioArchivo.getParent(), nombreNuevo);
                if (directorioArchivo.renameTo(nuevoDirectorio)) {
                    System.out.println("Directorio renombrado: " + nombreCarpeta + " -> " + nombreNuevo);
                    // Llamada recursiva con el nuevo nombre del directorio
                    RenombrarDirectoriosInternos(nuevoDirectorio);
                } else {
                    System.out.println("No se pudo renombrar el directorio: " + nombreCarpeta);
                }
            }
        }
    }
}
