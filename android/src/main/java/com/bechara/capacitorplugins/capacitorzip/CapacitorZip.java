package com.bechara.capacitorplugins.capacitorzip;

import android.util.Log;
import com.getcapacitor.JSObject;
import com.getcapacitor.PluginCall;
import java.io.IOException;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;

public class CapacitorZip {

    public String echo(String value) {
        Log.i("Zip", value);
        return value;
    }

    public void unzipFile(PluginCall call) {
        String source = call.getString("source");
        String destination = call.getString("destination");

        //convert capacitor absolute path to native absolute path
        source = source.replace("file://", "");
        destination = destination.replace("file://", "");

        // Create zip instance and check validity
        ZipFile zipFile = new ZipFile(source);
        if (!zipFile.isValidZipFile()) {
            call.reject("not valid source file");
            return;
        }

        try {
            zipFile.extractAll(destination);
            zipFile.close();

            JSObject ret = new JSObject();
            ret.put("result", true);
            ret.put("message", "Unzip Success");
            ret.put("uri", "file://" + destination);
            call.resolve(ret);
        } catch (ZipException e) {
            call.reject(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            call.reject(e.getMessage());
            e.printStackTrace();
        }
    }
}
