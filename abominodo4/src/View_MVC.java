public class View_MVC {
    public void   MainGUI() {
        Obs_Subject obs_Subject = new Obs_Subject();

        new Obs_StartG(obs_Subject);
        new Obs_Player(obs_Subject);
        new Obs_MainM(obs_Subject);
        new Obs_SelectDifficulty(obs_Subject);

        obs_Subject.Obs_notifing();
    }
}  

