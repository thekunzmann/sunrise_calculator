import com.google.gson.Gson;

public class Parser {
    public static final String testingJson = "{\n" +
            "      \"results\":\n" +
            "      {\n" +
            "        \"sunrise\":\"7:27:02 AM\",\n" +
            "        \"sunset\":\"5:05:55 PM\",\n" +
            "        \"solar_noon\":\"12:16:28 PM\",\n" +
            "        \"day_length\":\"9:38:53\",\n" +
            "        \"civil_twilight_begin\":\"6:58:14 AM\",\n" +
            "        \"civil_twilight_end\":\"5:34:43 PM\",\n" +
            "        \"nautical_twilight_begin\":\"6:25:47 AM\",\n" +
            "        \"nautical_twilight_end\":\"6:07:10 PM\",\n" +
            "        \"astronomical_twilight_begin\":\"5:54:14 AM\",\n" +
            "        \"astronomical_twilight_end\":\"6:38:43 PM\"\n" +
            "      },\n" +
            "       \"status\":\"OK\"\n" +
            "    }\n" +
            "      ";

    public static Sunrise parse(String jsonText) {
        Gson gson = new Gson();
        Sunrise sunrise = gson.fromJson(jsonText, Sunrise.class);
        return sunrise;
    }
}