package com.digdes.crp.javacoretasks.chapter9;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Exercise6 {
    /** Формат BMP для файлов несжатых изображений хорошо документирован и
    прост. Используя произвольный доступ, напишите программу, отражающую
    положение каждого ряда пикселей, не прибегая к записи в новый файл **/

    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Strelets.A\\Desktop\\javaTasks\\sample.bmp")){
            int i;
            while((i=fileInputStream.read()) != -1){
                System.out.print(i);
                }
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }
}
