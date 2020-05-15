public class Main {

    public static void main(String[] args) {

        showFileContent();
        //showWords();
        //singleWords();


    }

    public static void showFileContent(){
        ShowFileContent showFileContent = new ShowFileContent();
        showFileContent.read();


    }

    public static void showWords(){
        SeparateWords separateWords = new SeparateWords();

        for(String wc : separateWords){
            System.out.println(separateWords.get(wc) + " : "+wc);
        }

    }

    public static void singleWords(){
        SingleWords singleWords = new SingleWords();
        singleWords.showSingle();
        for(String wc : singleWords){
            System.out.println(wc);
        }
    }

}
