package dag11;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Circular {

    public static void main(String[] args) throws IOException {
        Path dir = Path.of("symlinkFun");
        Path sub = dir.resolve("sub");

        if (!Files.exists(dir)) {
            Files.createDirectory(dir);
        }

        if (!Files.exists(sub)) {
            Files.createDirectory(sub);
        }

        Path sym = Files.createSymbolicLink(sub.resolve("sym"), sub.toAbsolutePath());

        //FileSystemLoopException
        try (Stream<Path> walk = Files.walk(dir, FileVisitOption.FOLLOW_LINKS)) {
            walk.forEach(path -> {
                System.out.println(path);
            });
        }
    }
}
