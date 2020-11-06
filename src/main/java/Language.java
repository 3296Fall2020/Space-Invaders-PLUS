import java.io.IOException;

public class Language {

    private String TITLE = "Space Invaders";
    private String START = "Iniciar Miss�o";
    private String CLOSE = "Fechar";
    /*
     * Inicio
     */
    private String TOP_MESSAGE = "Space Invaders <br> Java Version";
    private String INITIAL_MESSAGE = "Ajude-nos, capit�o impressionante!!"
            + "<br>Os alien�genas est�o tentando invadir nosso planeta."
            + "<br><br><br>Sua miss�o:"
            + "<br><br>Matar todos os alien�genas invasores antes que eles consigam invadir o planeta Terra."
            + "<br>E, de prefer�ncia, n�o morra durante a batalha!"
            + "<br><br><br>BOA SORTE!!!";
    /*
     * Ajuda
     */
    private String HELP_TOP_MESSAGE = "Ajuda";
    private String HELP_MESSAGE = "Controles: "
            + "<br><br>Movimento � Esquerda: <br>Seta Esquerda do teclado"
            + "<br><br>Movimento � Direita: <br>Seta Direita do teclado"
            + "<br><br>Atirar: <br>Barra de espa�o";
    private String ENDING_WIN = "Parab�ns! Voc� salvou a gal�xia!";
    private String ENDING_LOSE = "Seu planeta nos pertence agora...";
    private String INVADE = "Aliens est�o invadindo a gal�xia!";

    private String Lang_select="Language Selection";

    private String Lang_Name = "none";

    public Language(String path) throws IOException {
        Config config = new Config(path);
        Lang_Name=config.getString("lang");
        TITLE = config.getString("title");
        START = config.getString("start");
        CLOSE = config.getString("close");

        TOP_MESSAGE = config.getString("top_message");
        INITIAL_MESSAGE = config.getString("initial_message");

        HELP_TOP_MESSAGE = config.getString("help_top_message");
        HELP_MESSAGE = config.getString("help_message");
        ENDING_WIN = config.getString("ending_win");
        ENDING_LOSE = config.getString("ending_lose");
        INVADE = config.getString("invade");

        Lang_select = config.getString("language_selection");
        //read file
    }

    public String getLanguageSelection(){
        return Lang_select;
    }
    public String getLanguageName(){
            return Lang_Name;
    }
    public String getEndingWinMessage(){
        return ENDING_WIN;
    }
    public String getInvadeMessage(){
        return INVADE;
    }
    public String getEndingLoseMessage(){
        return ENDING_LOSE;
    }
    public String getCloseMessage(){
        return CLOSE;
    }
    public String getTitle(){
        return TITLE;
    }
    public String getStartMessage(){
        return START;
    }
    public String getTopMessage(){
        return TOP_MESSAGE;
    }
    public String getInitialMessage() {
        return INITIAL_MESSAGE;
    }
    public String getHelpTopMessage(){
        return HELP_TOP_MESSAGE;
    }
    public String getHelpMessage(){
        return HELP_MESSAGE;
    }

}
