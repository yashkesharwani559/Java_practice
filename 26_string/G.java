public class G {
    public static void main(String[] args){
        String s = "I am a boy and a singer. I can do anything i want";

        System.out.println(s.indexOf('i'));//18

    }
}

// int indexOf(char) is an instance method in the class String that is used to get the index of the first occurence of the character
// it returns int index of the char in the String(first occurence)

//indexOf() is opposite of the charAt() because 
// charAt() takes index as input and returns the character at that index 
// whereas indexOf() takes character as input and returns the index of the first occurence of that character
