package org.cc.codedemo.io.test1;

import org.apache.commons.io.IOUtils;

import java.io.*;

/**
 * Created by tomchen on 15-3-3.
 */
public class MyIOUtils{

    public static void main(String[] args){
//        IOUtils.read()
    }

    public static void copy(){}

    public static void copyLarge(){}
    public static void lineIterator(){}
    public static int read(InputStream io, byte[] buffer){


        return 0;
    }
    public static void readFully(){}
    public static void readLines(){}
    public static void toBufferedInputStream(){}
    public static void toBufferedReader(){}
    public static void toByteArray(){}
    public static void toCharArray(){}
    public static void toInputStream(){}
    public static void toStr(){}
    public static void write(){}
    public static void writeLines(){}


    public static void close(InputStream in){
        try{
            if(in != null){
                in.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void close(OutputStream out){
        try{
            if(out != null){
                out.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void close(Reader in){
        try{
            if(in != null){
                in.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void close(Writer out){
        try{
            if(out != null){
                out.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
