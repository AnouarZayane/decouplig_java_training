package fr.lernejo.logger;

public class LoggerFactory {

    Logger logger = LoggerFactory.getLogger("launcher");
    public static Logger getLogger(String name)
    {
      return new ContextualLogger(new FileLogger("C:/Users/user_pc/Desktop/Architecture/decouplig_java_training/decouplig_java_training/logs.txt"),name);
    }
}
