package twentyoone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1KeepingScore {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
  public static void main(String[]args) throws IOException {
    String x=next();
    int pA=0;
    int pB=0;
    int pC=0;
    int pD=0;
    int nA=0;
    int nB=0;
    int nC=0;
    int nD=0;
    int index=1;
    char b='C';
    char[] bc= {'C','D','H','S'};
    int c=0;
    String[] a=new String[4];
    a[0]="Clubs";
        a[1]="Diamonds";
        a[2]="Hearts";
        a[3]="Spades";
    for(int i=index;i<x.length();i++) {
      
      if(x.charAt(i)!='C'&&x.charAt(i)!='D'&&x.charAt(i)!='H'&&x.charAt(i)!='S') {
        a[c]=a[c]+Character.toString(x.charAt(i));
        if(b=='C') {
          nA++;
        }
        if(b=='D') {
          nB++;
        }
        if(b=='H') {
          nC++;
        }
        if(b=='S') {
          nD++;
        }
        if(x.charAt(i)=='J') {
          if(b=='C') {
            pA+=1;
          }
          if(b=='D') {
            pB+=1;
          }
          if(b=='H') {
            pC+=1;
          }
          if(b=='S') {
            pD+=1;
          }
        }
        if(x.charAt(i)=='Q') {
          if(b=='C') {
            pA+=2;
          }
          if(b=='D') {
            pB+=2;
          }
          if(b=='H') {
            pC+=2;
          }
          if(b=='S') {
            pD+=2;
          }
        }
        if(x.charAt(i)=='K') {
          if(b=='C') {
            pA+=3;
          }
          if(b=='D') {
            pB+=3;
          }
          if(b=='H') {
            pC+=3;
          }
          if(b=='S') {
            pD+=3;
          }
        }
        if(x.charAt(i)=='A') {
          if(b=='C') {
            pA+=4;
          }
          if(b=='D') {
            pB+=4;
          }
          if(b=='H') {
            pC+=4;
          }
          if(b=='S') {
            pD+=4;
          }
        }
      }
      else {
        if(b=='C') {
          if(nA==0) {
            pA+=3;
          }
          if(nA==1) {
            pA+=2;
          }
          if(nA==2) {
            pA+=1;
          }
        }
        if(b=='D') {
          if(nB==0) {
            pB+=3;
          }
          if(nB==1) {
            pB+=2;
          }
          if(nB==2) {
            pB+=1;
          }
        }
        if(b=='H') {
          if(nC==0) {
            pC+=3;
          }
          if(nC==1) {
            pC+=2;
          }
          if(nC==2) {
            pC+=1;
          }
        }
        if(b=='S') {
          if(nD==0) {
            pD+=3;
          }
          if(nD==1) {
            pD+=2;
          }
          if(nD==2) {
            pD+=1;
          }
        }
        index=i+1;
        c++;
        b=bc[c];
        break;
      }
    
    }
for(int i=index;i<x.length();i++) {
      
      if(x.charAt(i)!='C'&&x.charAt(i)!='D'&&x.charAt(i)!='H'&&x.charAt(i)!='S') {
        a[c]=a[c]+Character.toString(x.charAt(i));
        if(b=='C') {
          nA++;
        }
        if(b=='D') {
          nB++;
        }
        if(b=='H') {
          nC++;
        }
        if(b=='S') {
          nD++;
        }
        if(x.charAt(i)=='J') {
          if(b=='C') {
            pA+=1;
          }
          if(b=='D') {
            pB+=1;
          }
          if(b=='H') {
            pC+=1;
          }
          if(b=='S') {
            pD+=1;
          }
        }
        if(x.charAt(i)=='Q') {
          if(b=='C') {
            pA+=2;
          }
          if(b=='D') {
            pB+=2;
          }
          if(b=='H') {
            pC+=2;
          }
          if(b=='S') {
            pD+=2;
          }
        }
        if(x.charAt(i)=='K') {
          if(b=='C') {
            pA+=3;
          }
          if(b=='D') {
            pB+=3;
          }
          if(b=='H') {
            pC+=3;
          }
          if(b=='S') {
            pD+=3;
          }
        }
        if(x.charAt(i)=='A') {
          if(b=='C') {
            pA+=4;
          }
          if(b=='D') {
            pB+=4;
          }
          if(b=='H') {
            pC+=4;
          }
          if(b=='S') {
            pD+=4;
          }
        }
      }
      else {
        if(b=='C') {
          if(nA==0) {
            pA+=3;
          }
          if(nA==1) {
            pA+=2;
          }
          if(nA==2) {
            pA+=1;
          }
        }
        if(b=='D') {
          if(nB==0) {
            pB+=3;
          }
          if(nB==1) {
            pB+=2;
          }
          if(nB==2) {
            pB+=1;
          }
        }
        if(b=='H') {
          if(nC==0) {
            pC+=3;
          }
          if(nC==1) {
            pC+=2;
          }
          if(nC==2) {
            pC+=1;
          }
        }
        if(b=='S') {
          if(nD==0) {
            pD+=3;
          }
          if(nD==1) {
            pD+=2;
          }
          if(nD==2) {
            pD+=1;
          }
        }
        index=i+1;
        c++;
        b=bc[c];
        break;
      }
    
    }
for(int i=index;i<x.length();i++) {
  
  if(x.charAt(i)!='C'&&x.charAt(i)!='D'&&x.charAt(i)!='H'&&x.charAt(i)!='S') {
    a[c]=a[c]+Character.toString(x.charAt(i));
    if(b=='C') {
      nA++;
    }
    if(b=='D') {
      nB++;
    }
    if(b=='H') {
      nC++;
    }
    if(b=='S') {
      nD++;
    }
    if(x.charAt(i)=='J') {
      if(b=='C') {
        pA+=1;
      }
      if(b=='D') {
        pB+=1;
      }
      if(b=='H') {
        pC+=1;
      }
      if(b=='S') {
        pD+=1;
      }
    }
    if(x.charAt(i)=='Q') {
      if(b=='C') {
        pA+=2;
      }
      if(b=='D') {
        pB+=2;
      }
      if(b=='H') {
        pC+=2;
      }
      if(b=='S') {
        pD+=2;
      }
    }
    if(x.charAt(i)=='K') {
      if(b=='C') {
        pA+=3;
      }
      if(b=='D') {
        pB+=3;
      }
      if(b=='H') {
        pC+=3;
      }
      if(b=='S') {
        pD+=3;
      }
    }
    if(x.charAt(i)=='A') {
      if(b=='C') {
        pA+=4;
      }
      if(b=='D') {
        pB+=4;
      }
      if(b=='H') {
        pC+=4;
      }
      if(b=='S') {
        pD+=4;
      }
    }
  }
  else {
    if(b=='C') {
      if(nA==0) {
        pA+=3;
      }
      if(nA==1) {
        pA+=2;
      }
      if(nA==2) {
        pA+=1;
      }
    }
    if(b=='D') {
      if(nB==0) {
        pB+=3;
      }
      if(nB==1) {
        pB+=2;
      }
      if(nB==2) {
        pB+=1;
      }
    }
    if(b=='H') {
      if(nC==0) {
        pC+=3;
      }
      if(nC==1) {
        pC+=2;
      }
      if(nC==2) {
        pC+=1;
      }
    }
    if(b=='S') {
      if(nD==0) {
        pD+=3;
      }
      if(nD==1) {
        pD+=2;
      }
      if(nD==2) {
        pD+=1;
      }
    }
    index=i+1;
    c++;
    b=bc[c];
    break;
  }

}
for(int i=index;i<x.length();i++) {
  
  if(x.charAt(i)!='C'&&x.charAt(i)!='D'&&x.charAt(i)!='H'&&x.charAt(i)!='S') {
    a[c]=a[c]+Character.toString(x.charAt(i));
    if(b=='C') {
      nA++;
    }
    if(b=='D') {
      nB++;
    }
    if(b=='H') {
      nC++;
    }
    if(b=='S') {
      nD++;
    }
    if(x.charAt(i)=='J') {
      if(b=='C') {
        pA+=1;
      }
      if(b=='D') {
        pB+=1;
      }
      if(b=='H') {
        pC+=1;
      }
      if(b=='S') {
        pD+=1;
      }
    }
    if(x.charAt(i)=='Q') {
      if(b=='C') {
        pA+=2;
      }
      if(b=='D') {
        pB+=2;
      }
      if(b=='H') {
        pC+=2;
      }
      if(b=='S') {
        pD+=2;
      }
    }
    if(x.charAt(i)=='K') {
      if(b=='C') {
        pA+=3;
      }
      if(b=='D') {
        pB+=3;
      }
      if(b=='H') {
        pC+=3;
      }
      if(b=='S') {
        pD+=3;
      }
    }
    if(x.charAt(i)=='A') {
      if(b=='C') {
        pA+=4;
      }
      if(b=='D') {
        pB+=4;
      }
      if(b=='H') {
        pC+=4;
      }
      if(b=='S') {
        pD+=4;
      }
    }
  }
  else {
    if(b=='C') {
      if(nA==0) {
        pA+=3;
      }
      if(nA==1) {
        pA+=2;
      }
      if(nA==2) {
        pA+=1;
      }
    }
    if(b=='D') {
      if(nB==0) {
        pB+=3;
      }
      if(nB==1) {
        pB+=2;
      }
      if(nB==2) {
        pB+=1;
      }
    }
    if(b=='H') {
      if(nC==0) {
        pC+=3;
      }
      if(nC==1) {
        pC+=2;
      }
      if(nC==2) {
        pC+=1;
      }
    }
    if(b=='S') {
      if(nD==0) {
        pD+=3;
      }
      if(nD==1) {
        pD+=2;
      }
      if(nD==2) {
        pD+=1;
      }
    }
    index=i+1;
    c++;
    b=bc[c];
    break;
  }
}
if(nD==0) {
  pD+=3;
}

    System.out.println("Cards Dealt                   Points");
    System.out.println(a[0].toString()+"           " +pA);
    System.out.println(a[1].toString()+"           " +pB);
    System.out.println(a[2].toString()+"           " +pC);
    System.out.println(a[3].toString()+"           " +pD);
    System.out.println("Total"+" "+(pA+pB+pC+pD));
    

    



  }
  static String next () throws IOException {
    while (st == null || !st.hasMoreTokens())
        st = new StringTokenizer(br.readLine().trim());
    return st.nextToken();
}
static long readLong () throws IOException {
    return Long.parseLong(next());
}
static int readInt () throws IOException {
    return Integer.parseInt(next());
}
static double readDouble () throws IOException {
    return Double.parseDouble(next());
}
static String readLine () throws IOException {
    return br.readLine().trim();
}
}
