import java.util.Scanner;

   public class Entrada {
  
     public static void main(String[] args){
     Scanner menu = new Scanner (System.in);

            System.out.print("|--------------|\n");
            System.out.print("| Jogar        |\n");
            System.out.print("| Créditos     |\n");
            System.out.print("| Sair         |\n");
            System.out.print("|--------------|\n");
           

            int opcao = menu.nextInt();


            switch (opcao) {
            case 1:jogar();
                
                break;

            case 2:
                System.out.print("\nDesenvolvedores: \nLucas Silva \nJhonatan Silva \nHélio \nCélia\n");
                break;

            case 3:
                System.out.print("\nAté Mais\n");
                break;
               
           
             default:
                System.out.print("\nOpção Inválida!");
                menu.close();

           
             
                       
            }
        }
   
   
   

 
  public static void jogar() {
	   
	    Scanner entrada = new Scanner (System.in);

	        String name;



                System.out.println("Entre nessa jornada com Cleitin o humano e construa sua própria nação.");
                System.out.println("\n");
                System.out.println("No ano 5000, a terra vivia o auge da tecnologia…Os humanos estavam no ápice de "

                + "sua inteligência, \nporém cientistas malucos, com uma idéia de fundir a inteligência humana "

                + "com animais ocasionaram \numa explosão nuclear na qual levou quase toda a raça humana a "

                + "extinção…O plano por sua vez deu certo animais \nganharam inteligência, mas grande parte "

                + "se revoltou e começaram a construir \nsua própria civilização a fim de tornar o mundo um só "

                + "para sua raça.\n5 de novembro de 5000… Cleitin te encontra em uma caverna \nvocê com medo procura pegar pedras para se defender");

                System.out.println("\n");

                System.out.println("Cleitin: Ei calma… Eu sou um humano também - ele tenta te acalmar ");  

                System.out.println("\n");

                System.out.println("Cleitin: Me diga qual é o seu nome?");
                 name = entrada.next();

                System.out.println("\n");

                System.out.println("Eu me chamo " + name);  

                System.out.println("\n");

                System.out.println("Cleitin olá " + name + "... estou em busca de um líder para reconstruir minha nação, você está aqui á quanto tempo?");

                System.out.println("\n");

                System.out.println(name + ": já não sei a quanto tempo estou aqui, vivo aqui sozinho noite após noite");

                System.out.println("\n");

                System.out.println("Cleitin: Venha comigo, não sei mas você parecer ter um espírito de líder… \nEstou tentando construir uma nação, mas a verdade é que não sei governar nada.");

                System.out.print("\n");

               
                Scanner s = new Scanner(System.in);

                System.out.println("Então me diz você aceita ser um líder? [sim/nao]");

                String lt= s.nextLine();


        if(lt.equals("nao")) {

                System.out.println("Cleitin: Que pena, Você seria um grande líder, Continuarei minha jornada em busca de alguém para ajudar meu povo ");

        }else if(lt.equals("sim")) {

                System.out.println("Tenho dúvidas sobre isso, mas acredito que seja melhor do que viver aqui sozinho.Vamos nessa!!");

                System.out.println("\n");

                System.out.println("Cleitin e " + name +" começam a caminhar, " + name + " logo percebe que Cleitin é um cara que não "
                		+ "\npara de falar e ama fazer uma piada com as situaçõe… Após longos, longos,"
                		+ "\nminutos andando, chegam ao pequeno vilarejo que Cleitin está construindo");

                System.out.println("\n");

                System.out.println(name + ":Nossa pensei que eu iria governar algo grandioso…");

                System.out.println("\n");

                System.out.println("Cleitin: Calma, Calma  isso é só um holograma… Temos que deixar a cidade disfarçada, somos muito fracos "
                		+ "\npara sofrer um ataque, não temos estrutura para isso");

                System.out.println("\n");

                System.out.println("Entendo, desculpa por me precipitar! ");

                System.out.println("\n");

                System.out.println("Cleitin entra primeiro, logo depois" + name + "vai atrás dele." + name + "fica admirado com tamanha "

                + "\nbeleza da cidade… Uma cidade, construída em volta de duas grandes "

                + "\nrochas ,com uma ponte ligando as duas rochas, logo abaixo na parte térrea um grande castelo, casas e "

                + "\npequenos prédios ainda destruídos por conta da explosão, mas, com pessoas e crianças "

                + "\nfelizes por ainda ter um lar… Essa foi a primeira visão de" + name + "sobre a cidade");
System.out.print("∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◣ \r\n"
		+ "∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇◣ \r\n"
		+ "∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇▇◣ \r\n"
		+ "∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇▇▇◣ \r\n"
		+ "∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▋ \r\n"
		+ "∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▋ \r\n"
		+ "∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵ ▋ \r\n"
		+ "∵∵∵∵◣∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▋∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◣ \r\n"
		+ "∵∵∵∵▇◣∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◢▇◣∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇◣ \r\n"
		+ "∵∵∵∵▇▇◣∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◢▇▇▇◣∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇▇◣ \r\n"
		+ "∵∵∵∵▇▇▇◣∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◢▇▇▇▇▇◣∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇▇▇◣ \r\n"
		+ "∵∵∵∵▊∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◥▇╭┯╮▇◤∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▊ \r\n"
		+ "∵∵∵∵▊∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇┠╂┨▇∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▊ \r\n"
		+ "∵∵∵∵▊∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇╰┷╯▇∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▊ \r\n"
		+ "∵∵∵◢▇◣∵∴∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◥▇▇▇◤∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◢▇◣ \r\n"
		+ "∵∵◢▇▇▇◣∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◢▇▇▇◣ \r\n"
		+ "∵◢▇▇▇▇▇◣∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵ ▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◢▇▇▇▇▇◣ \r\n"
		+ "∵◥▇╭┯╮▇◤∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◥▇╭┯╮▇◤ \r\n"
		+ "∵∵▇┠╂┨▇∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇┠╂┨▇ \r\n"
		+ "∵∵▇╰┷╯▇∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇╰┷╯▇ \r\n"
		+ "∵∵◥▇▇▇◤∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◥▇▇▇◤ \r\n"
		+ "∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉ \r\n"
		+ "∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉ \r\n"
		+ "∵∵∵▆▆▉∴∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉ \r\n"
		+ "∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉ \r\n"
		+ "∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉ \r\n"
		+ "∵∴◢▇▇▇◣∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◢▇▇▇◣∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◢▇▇▇◣ \r\n"
		+ "∵∵▉╭┯╮▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇╭┯╮▇∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇╭┯╮▇ \r\n"
		+ "∵∵▉┠╂┨▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇┠╂┨▇∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇┠╂┨▇ \r\n"
		+ "∵∵▉╰┷╯▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇╰┷╯▇∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▇╰┷╯▇ \r\n"
		+ "∵∵◥▇▇▇◤∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◥▇▇▇◤∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵◥▇▇▇◤ \r\n"
		+ "∵∵∵▆▆▇∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉ \r\n"
		+ "∵∵∵▆▆▇∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉ \r\n"
		+ "∵∵∵▆▆▇∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵∵▆▆▉ \r\n"
		+ "∵∵∵▆▆▇∵▉∵▉∵▉∵▉∵▉∵▉∵▉∵▉∵▉∵▆▆▉∵▉∵▉∵▉∵▉∵▉∵▉∵▉∵▉∵▉∵▆▆▉ \r\n"
		+ "∵∵∵▆▆▇∵▉∵▉∵▉∵▉∵▉∵▉∵▉∵▉∵▉∵▆▆▉∵▉∵▉∵▉∵▉∵▉∵▉∵▉∵▉∵▉∵▆▆▉ \r\n"
		+ "∵∵∵▆▆▇∵▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉∵▆▆▉∵▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▆▉ \r\n"
		+ "∵∵◢▆▆▇∵▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉∵▆▆▉∵▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉◣ \r\n"
		+ "∵∵▉▇▇▇▉▉┏┯┓▉┏┯┓▉┏┯┓▉┏┯┓▉▉▇▇▇▉▉┏┯┓▉┏┯┓▉┏┯┓▉┏┯┓▉▉▇▇▇▉ \r\n"
		+ "∵∵▉╭┯╮▉▉┠╂┨▉┠╂┨▉┠╂┨▉┠╂┨▉▉╭┯╮▉▉┠╂┨▉┠╂┨▉┠╂┨▉┠╂┨▉▉╭┯╮▉ \r\n"
		+ "∵∵▉┠╂┨▉▉┠╂┨▉┠╂┨▉┠╂┨▉┠╂┨▉▉┠╂┨▉▉┠╂┨▉┠╂┨▉┠╂┨▉┠╂┨▉▉┠╂┨▉ \r\n"
		+ "∵∵▉┠╂┨▉▉┠╂┨▉┠╂┨▉┠╂┨▉┠╂┨▉▉┠╂┨▉▉┠╂┨▉┠╂┨▉┠╂┨▉┠╂┨▉▉┠╂┨▉ \r\n"
		+ "∵∵▉╰┷╯▉▉┗┷┛▉┗┷┛▉┗┷┛▉┗┷┛▉▉╰┷╯▉▉┗┷┛▉┗┷┛▉┗┷┛▉┗┷┛▉▉╰┷╯▉ \r\n"
		+ "∵∵▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉ \r\n"
		+ "∵∵▉╭┯╮▉▉┏┯┓▉┏┯┓▉┏┯┓▉┏┯┓▉▉╭┯╮▉▉┏┯┓▉┏┯┓▉┏┯┓▉┏┯┓▉▉╭┯╮▉ \r\n"
		+ "∵∵▉┠╂┨▉▉┠╂┨▉┠╂┨▉┠╂┨▉┠╂┨▉▉┠╂┨▉▉┠╂┨▉┠╂┨▉┠╂┨▉┠╂┨▉▉┠╂┨▉ \r\n"
		+ "∵∵▉┠╂┨▉▉┠╂┨▉┠╂┨▉┠╂┨▉┠╂┨▉▉┠╂┨▉▉┠╂┨▉┠╂┨▉┠╂┨▉┠╂┨▉▉┠╂┨▉ \r\n"
		+ "∵∵▉╰┷╯▉▉┗┷┛▉┗┷┛▉┗┷┛▉┗┷┛▉▉╰┷╯▉▉┗┷┛▉┗┷┛▉┗┷┛▉┗┷┛▉▉╰┷╯▉ \r\n"
		+ "∵∵▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉ \r\n"
		+ "∵∵▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉ \r\n"
		+ "∵∵▉▉┏┯┓▉▉┏┯┓┏┯┓▉┏┯┓┏┯┓▉▉┏┯┯┯┓▉▉┏┯┓┏┯┓▉┏┯┓┏┯┓▉▉┏┯┓▉▉ \r\n"
		+ "∵∵▉▉┠╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂╂╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂┨▉▉ \r\n"
		+ "∵∵▉▉┠╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂╂╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂┨▉▉ \r\n"
		+ "∵∵▉▉┗┷┛▉▉┗┷┛┗┷┛▉┗┷┛┗┷┛▉▉┗┷┷┷┛▉▉┗┷┛┗┷┛▉┗┷┛┗┷┛▉▉┗┷┛▉▉ \r\n"
		+ "∵∵▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉ \r\n"
		+ "∵∵▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉ \r\n"
		+ "∵∵▉▉┏┯┓▉▉┏┯┓┏┯┓▉┏┯┓┏┯┓▉▉┏┯┯┯┓▉▉┏┯┓┏┯┓▉┏┯┓┏┯┓▉▉┏┯┓▉▉ \r\n"
		+ "∵∵▉▉┠╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂╂╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂┨▉▉ \r\n"
		+ "∵∵▉▉┠╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂╂╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂┨▉▉ \r\n"
		+ "∵∵▉▉┗┷┛▉▉┗┷┛┗┷┛▉┗┷┛┗┷┛▉▉┗┷┷┷┛▉▉┗┷┛┗┷┛▉┗┷┛┗┷┛▉▉┗┷┛▉▉ \r\n"
		+ "∵∵▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉ \r\n"
		+ "∵∵▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉▉ \r\n"
		+ "∵∵▉▉┏┯┓▉▉┏┯┓┏┯┓▉┏┯┓┏┯┓▉▉┏┯┯┯┓▉▉┏┯┓┏┯┓▉┏┯┓┏┯┓▉▉┏┯┓▉▉ \r\n"
		+ "∵∵▉▉┠╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂╂╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂┨▉▉ \r\n"
		+ "∵∵▉▉┠╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂╂╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂┨▉▉ \r\n"
		+ "∵∵▉▉┠╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂╂╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂┨▉▉ \r\n"
		+ "∵∵▉▉┠╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂╂╂┨▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┠╂┨▉▉ \r\n"
		+ "∵∵▉▉┗┷┛▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┗┷┷┷┛▉▉┠╂┨┠╂┨▉┠╂┨┠╂┨▉▉┗┷┛▉▉ \r\n"
		+ "∵◢▉▉▉▉▉▉▉┗┷┛┗┷┛▉┗┷┛┗┷┛▉▉▉┏┯┓▉▉▉┗┷┛┗┷┛▉┗┷┛┗┷┛▉▉▉▉▉▉▉◣ \r\n"
		+ "◢▉▉▉▉▉▉▉▉▅▅▅▆▆▆▇▆▆▆▅▅▅▉▉▉┗┷┛▉▉▉▉▉▅▅▅▆▆▆▇▆▆▆▅▅▅▉▉▉▉▉▉▉▉◣ \r\n"
		+ "▅▅▅▅▅▅◢▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆☼▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆◣▅▅▅▅▅▅▅▅\r\n"
		+ "▅▅▅▅▅◢▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆☼▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆◣▅▅▅▅▅▅▅\r\n"
		+ "▅▅▅▅◢▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆☼▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆◣▅▅▅▅▅▅\r\n"
		+ "▅▅▅◢▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆☼▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆◣▅▅▅▅▅\r\n"
		+ "▅▅◢▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆☼▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆▆◣▅▅▅▅\r\n"
		+ "");
        
        System.out.println("\n");

        System.out.println("Cleitin: Gostou né? lolololol… Bem vamos andando quero te mostrar seus aposentos e "

                + "\nainda hoje te anunciar como novo líder de nossa nação");

        System.out.println("\n");

        System.out.println(name +":Confesso que estou um pouco animado, você disse que sou o escolhido, mas tenho "

                + "\nas minhas dúvidas… Talvez o povo não me aceite");

        System.out.println("\n");

        System.out.println("Cleitin: Vamos, seja um pouco otimista vai dar bom!");

        System.out.println("\n");

        System.out.println("Cleitin leva " + name + " para seus aposentos");

        System.out.println("\n");

        System.out.println(name  + ": Onde fica meus aposentos?");

        System.out.println("\n");

        System.out.println("Cleitin: Nas Rochas");

        System.out.println("\n");

        System.out.println(name + ":Orra, to importante lololo. Tem elevador né?");

        System.out.println("\n");

        System.out.println("Cleitin: Não");

        System.out.println("\n");

        System.out.println(name + ": a para de brincadeira");

        System.out.println("\n");

        System.out.println("Cleitin: Não é brincadeira");

        System.out.println("\n");

        System.out.println(name +" Pensando bem posso morar por aqui embaixo mesmo, pra que esse exagero né… Sempre gostei de voar baixo");

        System.out.println("\n");

        System.out.println("Cleitin: Você é muito preguiçoso, é claro que tem elevador lolololol. Vamos logo para de enrolar");

        System.out.println("\n");

        System.out.println("Após chegarem nos aposentos, Cleitin mostra a sala de reunião. Uma sala enorme, com uma grande mesa com "

                + "\numa capacidade de até 20 lugares, uma janela com uma vista para "

                + "\na cidade, do começo ao fim");

        System.out.println("\n");

        System.out.println(name + "Nossa pra que essa ignorância toda - se referindo a mesa");

        System.out.println("\n");

       System.out.println("Cleitin: Essa é a mesa de reunião dos líderes");

        System.out.println("\n");

        System.out.println(name + "E quantos líderes tem nessa cidade?");

        System.out.println("\n");

        System.out.println("Cleitin: Contando com você?");

        System.out.println("\n");

        System.out.println(name + " Sim!!!");

        System.out.println("\n");

        System.out.println("Cleitin: Só 1 ");

        System.out.println("\n");

        System.out.println(name + " Ué lolololol");

        System.out.println("\n");

        System.out.println("Cleitin: Mas pensa esse é só o começo, logo você não terá paciência para tanto falatório aqui");

        System.out.println("\n");

        System.out.println(name + ": Estou confiante. Me mostre a cidade, quero entender tudo");

        System.out.println("\n");

        System.out.println("?????: CLEITIN,CLEITIN,CLEITIN ESTÃO ATACANDO A NOSSA CIDADE!!!");

        System.out.println("\n");

        System.out.println("Cleitin: Calma, isso é impossível… Se fosse um ataque o meu sensor teria avisado");

        System.out.println("\n");

        System.out.println("????? Sério mesmo? Então me explique isso - Mostra pela janela para Cleitin, o ataque acontecendo");

        System.out.println("\n");

        System.out.println("Cleitin: Droga, vamos lá" + name + "!");

        System.out.println("\n");

        System.out.println("????? : Deixa pra lá, não vai adiantar… é sempre a mesma coisa, já até foram embora."

                + "\nAliás, quem é esse aí?");

        System.out.println("\n");

        System.out.println(name + "O-oi sou o novo Líder!");

        System.out.println("\n");

        System.out.println("????? : Duvido, estranho desse jeito… só vai afundar ainda mais a nossa cidade");

        System.out.println("\n");

        System.out.println("Cleitin: Acredite, ele tem capacidade para nos liderar");

        System.out.println("\n");

        System.out.println(name +": Me diga qual seu nome? ");
        System.out.println("\n");
        System.out.println("Me chamo Leona... sou tesoureira da cidade");
        System.out.println("\n");
        System.out.println(name +": Acho que vou precisar de voce...");
        System.out.println("\n");
        
        System.out.println("Deseja recrutar Leona como tesoureira ou deixar as finaças por sua conta? [sim/nao]" );
        
        }

        Scanner s3 = new Scanner(System.in);

        String lt3= s3.nextLine();


        if(lt3.equals("nao")) {

        System.out.println("Voce levou a cidade a ruina (As vezes é necessario trabalho em equipe para que seus negócios avance!");

        }

        else if(lt3.equals("sim")) {

           

        System.out.println("Leona é sua nova tesoureira!! Leona estara presente em suas negociações");
        System.out.println("\n");
        System.out.println(name +": Já quero começar agir");        
        System.out.println("\n");
        System.out.println("Cleitin: Gosto assim. E o que você quer fazer primeiro?");
        System.out.println("\n");
        System.out.println("Leona: Droga!!! Os animais estão vindo de novo");
        System.out.println("\n");
        System.out.println(name +":Acho que minha primeira atitude deve ser falar com eles");
        System.out.println("\n");
        System.out.println("Entao" + name + " se dirige ao comandante dos animais.. com muito medo obiviamente. Em uma jogada estratégica ele propoem uma troca");
        System.out.println("\n");
        System.out.println(name+"Qual é seu nome?");
        System.out.println("\n");
        System.out.println("Me chamo Ganicos!! Sai da minha frente ou seja destruido junto com sua cidade!");
        System.out.println("\n");
        System.out.println(name+": É o seguinte Ganicos, eu sou o novo lider desta cidade! E estou cansdo de ver você "
        		+ "\nnos atacando só hoje foram dois ataques... Quero te propor um acordo!");
        System.out.println("\n");
        System.out.println("Ganicos: E qual seria? Seu verme");
        System.out.println("\n");
        System.out.println(name +": Temos recursos e você tem homens... Nossa cidade tem rochas podemos escavar e te dar "
        		+ "\nrecuros e você me da alguns homens" );
        System.out.println("\n");
        System.out.println("Ganicos: E se você nos der recursos e nós te damos paz e proteção");
        System.out.println("\n");
        System.out.println("Qual opção voce deseja? Digite 1 para aceitar a proposta de Ganicos ou 2 Para a sua Idéia!");
        }

        Scanner s2 = new Scanner(System.in);
        String lt2= s2.nextLine();


        if(lt2.equals("1")) {

        System.out.println("Você cumpriu com sua parte do acordo, porem Ganicos é desleal... Começou a escravisar seu povo e você foi a ruina"
        		+ "\n(Não se pode aceitar qualquer acordo, busque sempre um ponto seguro em suas negociações)");

        }

        else if(lt2.equals("2")) {

           

        System.out.println("Voce foi insistente em sua decisão, Ganicos reconheceu sua atitude e cumpriu com o acordo");
        }}}
