package com.example.faceall_lib;

/**
 * Created by guoyu24k on 16/6/14.
 */
public class FaceallHandler {

    static {
        System.loadLibrary("faceall");
    }

    private long handle = 0;

    public FaceallHandler(byte[] symbols){
        this.handle = faceall_load_model(symbols);
    }

    public void forward(byte[] img, int w, int h, int c, float[] result){
        if(this.handle!= 0){
            faceall_predict_single(handle,img, w,h,c,result);
        }
    }

    public void forwardMultiPic(byte[] img, int h, int w, int c, float[] result, int pic_num, int thread_num) {
        if(this.handle!=0) {
            faceall_predict(this.handle, img, h, w, c, pic_num, thread_num, result);
        }
    }

    public void free(){
        if(this.handle!=-1){
            faceall_release(handle);
            this.handle=-1;
        }
    }

    public native static long faceall_load_model(byte[] symbol);

    public native static int faceall_predict_single(long handler, byte[] img, int w, int h, int c, float[] result);

    public native static int faceall_predict(long handler, byte[] img, int w, int h, int c, int pic_num, int thread_num, float[] result);

    public native static int faceall_release(long handler);
}
