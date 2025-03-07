package Part1;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private Map<String, String> configMap;

    private ConfigurationManager(){
        configMap = new HashMap<String, String>();
        load();

    }
   private void   load(){
        configMap.put("maxPlayers","100");
        configMap.put("defaultLanguage","en");
        configMap.put("gameDifficulty","hard");
        configMap.put("minAge","12");
    }
    public  String  getConfig(String key){
        return configMap.get(key);

    }
    public void printConfigs(){
        for (String key : configMap.keySet()){
            System.out.println(key+":"+configMap.get(key));
        }
    }
    private static ConfigurationManager instance;

    public static ConfigurationManager getInstance(){
        if(instance==null){
            instance = new ConfigurationManager();
        }
        return instance;
    }
}
