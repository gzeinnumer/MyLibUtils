package com.gzeinnumer.gznutils.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

import java.io.ByteArrayOutputStream;

public class MBBase64 {
    /**
     * "data:image/jpeg;"
     */
    public static String convertToBase64FromPath(String imagePath) {
        try {
            Bitmap bm = BitmapFactory.decodeFile(imagePath);
            bm = Bitmap.createScaledBitmap(bm, 1024, 1024, false);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            bm.compress(Bitmap.CompressFormat.JPEG, 100, baos);
            byte[] byteArrayImage = baos.toByteArray();
            return "data:image/jpeg;base64," + Base64.encodeToString(byteArrayImage, Base64.DEFAULT);
        } catch (Exception e) {
            return " ";
        }
    }
}
