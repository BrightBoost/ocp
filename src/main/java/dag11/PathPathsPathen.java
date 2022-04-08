package dag11;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class PathPathsPathen {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Path p1 = Path.of("example", "example", "log.txt");
        Path p2 = Path.of("example", "example");

//        old way
//        p1.toFile().getParentFile().mkdirs();
//        p1.toFile().createNewFile();

        if (!Files.exists(p1)) {
            Files.createDirectories(p1.getParent());
            Files.createFile(p1);
        }

        System.out.println(Files.readAllLines(p1));
        System.out.println(Files.isSameFile(p1, p2));
        Files.isExecutable(p1);
        // please write your own OS to make this work
        // Files.copy(p1, p1, SoManyOptions.TADAA);

        BasicFileAttributeView bfav = Files.getFileAttributeView(p1, BasicFileAttributeView.class);
        BasicFileAttributes bfa = bfav.readAttributes();
        FileTime ft = bfa.lastModifiedTime();
//        for(String s : ZoneOffset.getAvailableZoneIds()) {
//            System.out.println(s);
//        }
        LocalDateTime ld = LocalDateTime.ofInstant(ft.toInstant(), ZoneId.systemDefault());
        System.out.println(ld);

    }
}
