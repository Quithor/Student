package top.yanquithor.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

public final class RuntimeParam {
    
    private static RuntimeParam object;
    private static Logger log = LoggerFactory.getLogger(RuntimeParam.class);
    private Properties language;
    private Properties setting;
    
    private RuntimeParam(){}
    
    private void loadAll() {
        try (Reader reader = new FileReader("")) {
            setting.load(reader);
        } catch (Exception e) {
            ExceptionLogger.toLogger(e, LoggerFactory.getLogger(getClass()));
            return;
        }
        try (Reader reader = new FileReader("")){
            language.load(reader);
        } catch (Exception e){
            ExceptionLogger.toLogger(e, LoggerFactory.getLogger(getClass()));
        }
    }
    
    public static RuntimeParam getObject(){
        if (object == null)
            object = new RuntimeParam();
        return object;
    }
    
    public Properties getSetting() {
        return setting;
    }
    
    public Properties getLanguage() {
        return language;
    }
}
