import java.io.*;
import java.net.*;

public class HttpURLConnection {
    public static void main(String[] args) throws IOException {
        sendGET();
    }

    private static void sendGET() throws IOException {
        String url = "https://api.telegram.org/bot1452596040:AAFs-WY32dorwkVOirwJ5MZhLf-hMf4BzbU/sendMessage?chat_id=-496992037&text=ok";
        try {

            URL urlObj = new URL(url);
            URLConnection urlCon = urlObj.openConnection();

            InputStream inputStream = urlCon.getInputStream();
            BufferedInputStream reader = new BufferedInputStream(inputStream);

            BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream("C:\\Users\\vissriva1\\Documents\\test.txt"));

            byte[] buffer = new byte[4096];
            int bytesRead = -1;

            while ((bytesRead = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, bytesRead);
            }

            writer.close();
            reader.close();

            System.out.println("data saved");

        } catch (MalformedURLException e) {
            System.out.println("The specified URL is malformed: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An I/O error occurs: " + e.getMessage());
        }

    }
}
