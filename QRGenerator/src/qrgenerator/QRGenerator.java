
package qrgenerator;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import java.nio.file.Paths;

public class QRGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String data = "0712696965";
        String destination = "qr_code.jpg";
        
        try
        {
            BitMatrix bm = new MultiFormatWriter().encode( "1", BarcodeFormat.QR_CODE, 600, 600);
            MatrixToImageWriter.writeToPath( bm, "jpg", Paths.get(destination));
        }catch( Exception e )
        {
            System.out.println("Error: " + e);
        }
    }
    
}
