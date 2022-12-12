package com.digdes.crp.javacoretasks.chapter9;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Exercise8 {

    /** Напишите служебный метод для создания архивного ZIP-файла, содержащего
    все файлы из выбранного каталога и его подкаталогов. **/

    private static final String DIR = System.getProperty("java.io.tmpdir");

    public static void main(String[] args) {
        File[] files = new File(DIR).listFiles();
        File f = new File("src/main/resources/textFiles/Files.zip");
        try(ZipOutputStream out = new ZipOutputStream(new FileOutputStream(f))) {
            ZipEntry e = new ZipEntry("info.txt");
            out.putNextEntry(e);
            assert files != null;
                byte[] data = Arrays.toString(files).getBytes();
                out.write(data, 0, data.length);
            out.closeEntry();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

}
