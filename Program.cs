using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication10
{
    class Program
    {
        static void Main()
        {
            int cg;
            int ca=0;
            Console.Write("vvedite koli4estvo grupp: ");
            cg = Int32.Parse(Console.ReadLine());
            int[,] rs = new int[cg, 7];
            Random rnd = new Random();

            for (int n = 0; n < cg; n++)
                for (int k = 0; k < 7; k++)
                {
                    int temp = rnd.Next(100);
                    if (temp % 2 == 0)
                        temp = 1;
                    else
                        temp = 0;
                    rs[n, k] = temp;
                }

            for (int n = 0; n < cg; n++)
            {
                for (int k = 0; k < 7; k++)
                    Console.Write(rs[n, k]+" ");
                Console.WriteLine();
            }

            for (int k = 0; k < 7; k++)
            {
                int temp = 0;
                for (int n = 0; n < cg; n++)
                {
                    if (rs[n, k] == 1)
                        temp++;
                }
                if (temp > ca)
                    ca = temp;
            }
            Console.WriteLine("koli4estvo auditorij " + ca);

            Console.ReadKey();
        }
    }
}
