package com.face.test;

import com.face.util.FaceUtil;

import java.io.File;

public class TestMain {
    public static void main(String[] args) throws Exception {
        File file2=new File("G:\\photo\\私人\\lyx3.jpg");
        String face_token2 = FaceUtil.detect(file2);//人脸检测
//        FaceUtil.addFace(face_token2);
        boolean result = FaceUtil.search(face_token2);//人脸搜索
        System.out.println("人脸搜索到的结果"+result);

       /* File file=new File("G:\\photo\\私人\\lyx.jpg");
        String face_token = FaceUtil.detect(file);//人脸检测
        System.out.println("face_token="+face_token);
//        FaceUtil.addFace(face_token);

        boolean result = FaceUtil.search(face_token);//人脸搜索
        System.out.println("人脸搜索到的结果"+result);*/


        /*System.out.println(FaceUtil.getDetail());
        boolean faceSet = FaceUtil.createFaceSet();
        System.out.println(faceSet);*/
    }
}
