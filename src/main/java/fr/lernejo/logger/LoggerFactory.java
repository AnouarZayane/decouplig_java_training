package fr.lernejo.logger;

public class LoggerFactory {

    Logger logger = LoggerFactory.getLogger("launcher");
    public static Logger getLogger(String name)
    {
      return new CompositeLogger(new ContextualLogger(new FileLogger("./logs.txt"),name),new ContextualLogger(new ConsoleLogger(),name));
    }
}
