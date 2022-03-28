package com.bechara.capacitorplugins.capacitorzip;

import android.util.Log;

import com.getcapacitor.JSObject;
import com.getcapacitor.PluginCall;

import net.lingala.zip4j.ZipFile;

import java.io.IOException;

public class CapacitorZip {

  public String echo(String value) {
    Log.i("Zip", value);
    return value;
  }

  public void unzipFile(PluginCall call) {
    String source = call.getString("source");
    String destination = call.getString("destination");

    //convert capacitor absolute path to native absolute path
    if (source.contains("_capacitor_")) {
      source = source.replace("_capacitor_", "");
    }
    if (destination.contains("_capacitor_")) {
      destination = destination.replace("_capacitor_", "");
    }
    if (source.contains("file://")) {
      source = source.replace("file://", "");
    }
    if (destination.contains("file://")) {
      destination = destination.replace("file://", "");
    }


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
    } catch (IOException e) {
      call.reject(e.getMessage());
      e.printStackTrace();
    }
  }
}
