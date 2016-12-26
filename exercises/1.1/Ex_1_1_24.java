// Copyright (C) 2016  Maxim Bublis
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.

import edu.princeton.cs.algs4.StdOut;

public class Ex_1_1_24
{
    public static int gcd(int p, int q)
    {
        StdOut.printf("gcd(%d, %d)\n", p, q);
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args)
    {
        if (args.length != 2)
        {
            StdOut.println("exactly 2 arguments required");
            return;
        }

        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);

        StdOut.printf("gcd(%d, %d) = %d\n", p, q, gcd(p, q));
    }
}
