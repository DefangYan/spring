package com.example.ibeitys;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author defang.yan
 * @date 19-10-18 上午10:34
 */

/**
 * 找出指定路径下的文件夹中 word文件
 */
public class DirectoryTest {
    public static void main(String[] args) {
        File file = new File("/home/ydf/Desktop/文件上传下载&&开户");
        List<File> result = new ArrayList<File>();
        if(file.isDirectory()){
            for (File f: Objects.requireNonNull(file.listFiles())
                 ) {
                if(f.getName().toLowerCase().endsWith("png")){
                    result.add(f);
                }
            }
        }
        System.out.println(result.size());

        for (File file1 : result) {
            System.out.println(file1.getAbsolutePath());
        }
        ;
    }
}
