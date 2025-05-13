import java.util.HashMap;
import java.util.Map;

public class BuildInfoExtractor {

    public static Map<String, String> extractBuildInfo(String input) {
        Map<String, String> buildInfoMap = new HashMap<>();
        try {
            String[] parts = input.split("\\]: \\[");
            String fingerprint = parts[1].replace("]", "");
            String[] segments = fingerprint.split("/");
            String buildField = segments[3]; // PS7688.4591N
            String[] buildParts = buildField.split("\\."); // ["PS7688", "4591N"]
            String buildNumber = buildParts[1].replaceAll("[^0-9]", "");
            String userSegment = segments[5]; // 0032112766720:user
            String userType = userSegment.split(",")[1]; // "user"
            buildInfoMap.put("BuildNumber", buildNumber);
            buildInfoMap.put("UserType", userType);

        }catch (Exception e) {
            buildInfoMap.put("Error", "Invalid input format or data missing");
        }
        return buildInfoMap;
    }

    public static void main(String[] args) {
        String input = "[ro.build.fingerprint]: [Amazon/sheldonp/sheldonp:9/PS7688.4591N/0032112766720:user/amz-p,release-keys]";
        Map<String, String> result = extractBuildInfo(input);

        // Print result
        for (Map.Entry<String, String> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
