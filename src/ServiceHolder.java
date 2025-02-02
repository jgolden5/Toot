package src;

import Services.FileService;
import Services.ScannerService;

public class ServiceHolder {
  public static final FileService fileService = FileService.make();
  public static final ScannerService scannerService = ScannerService.make();
}
