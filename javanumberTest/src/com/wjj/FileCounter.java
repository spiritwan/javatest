package com.wjj;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileCounter {
    private static List<File> javaslf = new ArrayList<File>();
    private static List<File> xmlslf = new ArrayList<File>();
    public static void main(String[] args)throws Exception {
        String filename = "C:/Program Files/Java/jdk1.8.0_152";
        File  fir = new File(filename);
        try{
            FileCounter counter = new FileCounter();
            counter.getJavaAndXmlFiles(fir);
            int javanum = counter.getJavaFileNum(javaslf);
            int xmlnum = counter.getXmlFileNum(xmlslf);
            System.out.println("在"+filename+"中，java文件个数是："+javanum+"个；xml文件个数是："+xmlnum+"个！");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //循环路径下所有的文件
    public  void getJavaAndXmlFiles(File fir){
        if(!fir.exists()){
            System.out.println("文件名称不存在!");
        }else{
            if(fir.isFile()){
                String firName = fir.getName();
                if(firName.substring(firName.lastIndexOf(".")+1).equals("java")){
                    javaslf.add(fir); //统计type类型文件的数量
                }
                else if(firName.substring(firName.lastIndexOf(".")+1).equals("xml")){
                    xmlslf.add(fir);
                }
            }
            else{
                //如果fir是个文件夹，则遍历整个文件夹
                File[] files = fir.listFiles();
                if(files!=null)
                for(int i = 0;i<files.length;i++){
                    getJavaAndXmlFiles(files[i]);
                }
            }
        }
    }
    //得到java,xml文件的个数
    public  int getJavaFileNum(List<File> javafile){
        return javafile.size();
    }
    public int getXmlFileNum(List<File> XMLfile){
        return XMLfile.size();
    }
}
