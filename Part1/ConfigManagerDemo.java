public class ConfigManagerDemo {
    public static void main(String[] args) {
    Part1.ConfigurationManager configurationManager = Part1.ConfigurationManager.getInstance();
        System.out.println(configurationManager);
        System.out.println(configurationManager.getConfig("defaultLanguage"));

        configurationManager.printConfigs();
        System.out.println("\n\nSecond ConfigurationManager");
        Part1.ConfigurationManager configurationManager2 = Part1.ConfigurationManager.getInstance();
        System.out.println(configurationManager2);
        System.out.println(configurationManager2.getConfig("defaultLanguage"));

        configurationManager2.printConfigs();

    }
}
