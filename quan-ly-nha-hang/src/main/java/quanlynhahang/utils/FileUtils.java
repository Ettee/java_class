package quanlynhahang.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.web.multipart.MultipartFile;

public class FileUtils {

	public static String writeFile(MultipartFile file) throws IOException {
		// build file path
		File configFile = new File(System.getProperty("user.dir")+"/avarta/");
		if(!configFile.exists()) {
			configFile.mkdirs();
			
		}
		
		// This buffer will store the data read from 'file'
		byte[] buffer = new byte[1024 * 1024 * 2];
		String fileUploadPath=configFile.getAbsolutePath();
		String fsDocName=file.getOriginalFilename();
		// Now create the output file on the server.
		File outputFile = new File(fileUploadPath+"/"+ fsDocName);
		InputStream reader = null;
		FileOutputStream writer = null;
		ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
		try {

			outputFile.createNewFile();
			// Create the input stream to uploaded file to read data from it.
			reader = file.getInputStream();
			// Create writer for 'outputFile' to write data read from 'file'
			writer = new FileOutputStream(outputFile);
			// Iteratively read data from 'file' and write to 'outputFile'
			int bytesRead = 0;
			while ((bytesRead = reader.read(buffer)) != -1) {
				byteArray.write(buffer, 0, bytesRead);
			}
			byte[] drawData = byteArray.toByteArray();
			writer.write(drawData);
			return outputFile.getAbsolutePath();

		} catch (IOException e) {
			throw new IOException(e);
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				throw new IOException(e);
			}
		}
	}
}
