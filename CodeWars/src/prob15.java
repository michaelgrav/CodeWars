import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class prob15{
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> end = new ArrayList<>();
        Scanner reader = new Scanner(new File("input.txt"));
        ArrayList<String> list = new ArrayList<>();
        while(reader.hasNextLine())
        {
            String temp = reader.nextLine();
            if(temp.equals("END"))
            {
                break;
            }
            else
            {
                list.add(temp);
            }
        }
        ArrayList<String> prio = new ArrayList<>();
        ArrayList<String> gems = new ArrayList<>();
        ArrayList<String> Lapis= new ArrayList<>();
        ArrayList<String> Topaz= new ArrayList<>();
        ArrayList<String>Tourmaline= new ArrayList<>();
        ArrayList<String>Sapphire= new ArrayList<>();
        ArrayList<String>Peridot= new ArrayList<>();
        ArrayList<String>Ruby= new ArrayList<>();
        ArrayList<String>Pearl= new ArrayList<>();
        ArrayList<String>Emerald= new ArrayList<>();
        ArrayList<String>Diamond= new ArrayList<>();
        ArrayList<String>Aquamarine= new ArrayList<>();
        ArrayList<String>Amethyst= new ArrayList<>();
        ArrayList<String>Garnet = new ArrayList<>();
        gems.add("Lapis");
        gems.add("Topaz");
        gems.add("Tourmaline");
        gems.add("Sapphire");
        gems.add("Peridot");
        gems.add("Ruby");
        gems.add("Pearl");
        gems.add("Emerald");
        gems.add("Diamond");
        gems.add("Aquamarine");
        gems.add("Amethyst");
        gems.add("Garnet");
        for (int i = 0; i < list.size(); i++) {
            Scanner qwer = new Scanner(list.get(i));
            while(qwer.hasNext())
            {
                String temp = qwer.next();
                for (int j = 0; j < gems.size(); j++) {
                    if(temp.contains(gems.get(j)))
                    {
                        if(gems.get(j).length() == temp.length())
                        {
                            switch (gems.get(j)) {
                                case "Lapis" -> Lapis.add(list.get(i));
                                case "Topaz" -> Topaz.add(list.get(i));
                                case "Tourmaline" -> Tourmaline.add(list.get(i));
                                case "Sapphire" -> Sapphire.add(list.get(i));
                                case "Peridot" -> Peridot.add(list.get(i));
                                case "Ruby" -> Ruby.add(list.get(i));
                                case "Pearl" -> Pearl.add(list.get(i));
                                case "Emerald" -> Emerald.add(list.get(i));
                                case "Diamond" -> Diamond.add(list.get(i));
                                case "Aquamarine" -> Aquamarine.add(list.get(i));
                                case "Amethyst" -> Amethyst.add(list.get(i));
                                case "Garnet" -> Garnet.add(list.get(i));
                            }
                        }
                    }
                }
            }

        }
        String fin = "";
        Collections.sort(Lapis);
        Collections.sort(Topaz);
        Collections.sort(Tourmaline);
        Collections.sort(Sapphire);
        Collections.sort(Peridot);
        Collections.sort(Ruby);
        Collections.sort(Pearl);
        Collections.sort(Emerald);
        Collections.sort(Diamond);
        Collections.sort(Aquamarine);
        Collections.sort(Amethyst);
        Collections.sort(Garnet);
        Collections.sort(list);
        if(!Lapis.isEmpty())
        {
            for (int i = 0; i < Lapis.size(); i++) {
                if(!fin.contains( Lapis.get(i)))
                {
                    fin += " " + Lapis.get(i);
                    end.add(Lapis.get(i));

                }

            }
        }
        if(!Topaz.isEmpty())
        {
            for (int i = 0; i < Topaz.size(); i++) {
                if(!fin.contains( Topaz.get(i))){
                    fin += " " + Topaz.get(i);        end.add(Topaz.get(i));


                }
            }
        }
        if(!Tourmaline.isEmpty())
        {
            for (int i = 0; i < Tourmaline.size(); i++) {
                if(!fin.contains( Tourmaline.get(i))) {
                    fin += " " + Tourmaline.get(i);        end.add(Tourmaline.get(i));

                }

            }
        }
        if(!Sapphire.isEmpty())
        {
            for (int i = 0; i < Sapphire.size(); i++) {
                if(!fin.contains( Sapphire.get(i)))
                {
                    fin += " " + Sapphire.get(i);        end.add(Sapphire.get(i));

                }

            }
        }
        if(!Peridot.isEmpty())
        {
            for (int i = 0; i < Peridot.size(); i++) {
                if(!fin.contains( Peridot.get(i)))
                {
                    fin += " " + Peridot.get(i);        end.add(Peridot.get(i));

                }

            }
        }
        if(!Ruby.isEmpty())
        {
            for (int i = 0; i < Ruby.size(); i++) {
                if(!fin.contains( Ruby.get(i)))
                {
                    fin += " " + Ruby.get(i);        end.add(Ruby.get(i));

                }

            }
        }
        if(!Pearl.isEmpty())
        {
            for (int i = 0; i < Pearl.size(); i++) {
                if(!fin.contains( Pearl.get(i)))
                {
                    fin += " " + Pearl.get(i);        end.add(Pearl.get(i));

                }

            }
        }
        if(!Emerald.isEmpty())
        {
            for (int i = 0; i < Emerald.size(); i++) {
                if(!fin.contains( Emerald.get(i)))
                {
                    fin += " " + Emerald.get(i);        end.add(Emerald.get(i));


                }
            }
        }
        if(!Diamond.isEmpty())
        {
            for (int i = 0; i < Diamond.size(); i++) {
                if(!fin.contains( Diamond.get(i)))
                {
                    fin += " " + Diamond.get(i);        end.add(Diamond.get(i));


                }
            }
        }
        if(!Aquamarine.isEmpty())
        {
            for (int i = 0; i < Aquamarine.size(); i++) {
                if(!fin.contains( Aquamarine.get(i)))
                {
                    fin += " " + Aquamarine.get(i);        end.add(Aquamarine.get(i));


                }
            }
        }
        if(!Amethyst.isEmpty())
        {
            for (int i = 0; i < Amethyst.size(); i++) {
                if(!fin.contains( Amethyst.get(i)))
                {
                    fin += " " + Amethyst.get(i);        end.add(Amethyst.get(i));

                }

            }
        }
        if(!Garnet.isEmpty())
        {
            for (int i = 0; i < Garnet.size(); i++) {
                if(!fin.contains( Garnet.get(i)))
                {
                    fin += " " + Garnet.get(i);        end.add(Garnet.get(i));


                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if(!fin.contains( list.get(i)))
            {
                fin += " " + list.get(i);        end.add(list.get(i));

            }


        }
        for (int i = 0; i < end.size(); i++) {
            System.out.println(end.get(i));
        }

    }
}