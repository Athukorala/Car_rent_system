/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carrental.resourse;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nuwan Pradeep
 */
public class BackUpController {
    public boolean backupDataWithOutDatabase(String dumpExePath, String host, String port, String user, String password, String database, String backupPath) {
        boolean status = false;
            Process p = null;

            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
      
            Date date = new Date();
            String filepath = "backup(without_DB)-" + database + "-" + host + "-(" + dateFormat.format(date) + ").sql";

            String batchCommand = "";
            if (password != "") {
//only backup the data not included create database
                batchCommand = dumpExePath + " -h " + host + " --port " + port + " -u " + user + " --password=" + password + " " + database + " -r \"" + backupPath + "" + filepath + "\"";
            } else {
                batchCommand = dumpExePath + " -h " + host + " --port " + port + " -u " + user + " " + database + " -r \"" + backupPath + "" + filepath + "\"";
            }

            Runtime runtime = Runtime.getRuntime();
        try {
            p = runtime.exec(batchCommand);
        } catch (IOException ex) {
            Logger.getLogger(BackUpController.class.getName()).log(Level.SEVERE, null, ex);
        }
            int processComplete = 0;
        try {
            processComplete = p.waitFor();
        } catch (InterruptedException ex) {
            Logger.getLogger(BackUpController.class.getName()).log(Level.SEVERE, null, ex);
        }

            if (processComplete == 0) {
                status = true;
            
               // log.info("Backup created successfully for without DB " + database + " in " + host + ":" + port);
            } else {
                status = false;
                //log.info("Could not create the backup for without DB " + database + " in " + host + ":" + port);
            }
        return status;
    }
}
