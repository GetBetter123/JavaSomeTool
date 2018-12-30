package tony.nice.yuan;

import java.io.*;

public class FileUtils {

    public static void main(String[] args){
        String  path = "D:\\a\\b\\c\\";
        File dir = new File(path);
        //create directory
        boolean successFlag = emptyDictory(dir);
        System.out.print(successFlag);
    }

    public static boolean emptyDictory(File file){
        boolean flag = false;
        //the arg is invalid or the path is not exist
        if(null ==file || !file.exists()){
            return true;
        }
        if(file.isDirectory()){
            File[] fileArr = file.listFiles();
            int length = fileArr.length;
            for(int index = 0;index < length;index++){
                emptyDictory(fileArr[index]);
            }
            // delete current directory
            flag = file.delete();
        }else{ //delete file
            flag = file.delete();
        }
        return flag;
    }
}
