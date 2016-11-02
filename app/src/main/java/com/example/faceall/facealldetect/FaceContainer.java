package com.example.faceall.facealldetect;

import org.opencv.core.Mat;
import org.opencv.core.Rect;

/**
 * Created by guoyu24k on 16/10/10.
 */
public class FaceContainer {

    public FaceContainer(Mat face_clothes, Rect face_rect) {
        setFace_clothes(face_clothes);
        setFace_rect(face_rect);
    }

    public Mat getFace_clothes() {
        return face_clothes;
    }

    public void setFace_clothes(Mat face_clothes) {
        this.face_clothes = face_clothes;
    }

    public Rect getFace_rect() {
        return face_rect;
    }

    public void setFace_rect(Rect face_rect) {
        this.face_rect = face_rect;
    }

    private Mat face_clothes;
    private Rect face_rect;


}
