import java.io.*;
class ass10
{
public static void main(String args[])
{
File f=new File("a.txt");
File f2=new File("bcd.txt");
try
{
FileInputStream fin=new FileInputStream(f);
int r=fin.read();
FileOutputStream fout=new FileOutputStream(f2);
while(r!=-1)
{
fout.write((char)r);
r=fin.read();
}
fin=new FileInputStream(f2);
r=fin.read();
while(r!=-1)
{
System.out.print((char)r);
r=fin.read();
}
}
catch(IOException e)
{
System.out.println(e);
}
}
}