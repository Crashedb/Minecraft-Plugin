import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
    
        public void onEnable () {
            getLogger().info(ChatColor.RESET + "" + ChatColor.RED + "Plugin de vida Habilitado")


        }

        public void onDisable () {
            getLogger().info(ChatColor.RESET + "" + ChatColor.RED + "Plugin de Dano Desabilitado")


            
        }

        public boolean onCommand(CommandSender sender,
                            Command command, String label, String [] args) {
                                

                   if (sender instanceof Player){
                       if (command.getName().equalsIgnoreCase("Send")){
                           sender.sendMessage(ChatColor.GREEN + "Voce enviou uma mensagem!");
                           
                       }
                       if (command.getName().equalsIgnoreCase("heal")){
                           Player player = (player) sender;
                           if (player.getHealth()<10){
                               player.setHealth(20);
                               plyer.sendMessage(ChatColor.GREEN + "Pronto, vida recuperada!");
                           } else {
                               player.sendMessage(ChatColor.GREEN + "Tem muita vida ainda, quando tiver menos voce volta.");
                           }

                        }

                        return false;




}