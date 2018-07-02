package z07;

import java.io.IOException;

public class MainService {

    private FileAccessService fileAccessService;

    public MainService(FileAccessService fileAccessService) {
        this.fileAccessService = fileAccessService;
    }
    public int numIfLines() throws IOException {
        return fileAccessService.loadAllLines().size();
    }

}
