#!/bin/bash

cd ./fr.idmteam1.idmproject.dronedsl/src-gen/fr/idmteam1/idmproject/dronedsl/droneDSL/impl/

#For particular type like Pourcent and Second
#PourcentConstImpl
head -n $(( $(wc -l PourcentConstImpl.java | awk '{print $1}') - 13 )) PourcentConstImpl.java  > PourcentConstImpl_tmp.java 
echo "  @Override
  public String toString()
  {
    return this.val.split(\"\\\%\")[0];
  }

} //ModifiedPourcentConstImpl toString added" >> PourcentConstImpl_tmp.java
mv PourcentConstImpl_tmp.java PourcentConstImpl.java 

#SecondeConstImpl
head -n $(( $(wc -l SecondeConstImpl.java | awk '{print $1}') - 13 )) SecondeConstImpl.java  > SecondeConstImpl_tmp.java 
echo "  @Override
  public String toString()
  {
    return this.val;
  }

} //ModifiedSecondeConstImpl toString added" >> SecondeConstImpl_tmp.java
mv SecondeConstImpl_tmp.java SecondeConstImpl.java 


#PourcentDeclImpl
head -n $(( $(wc -l PourcentDeclImpl.java | awk '{print $1}') - 2 )) PourcentDeclImpl.java  > PourcentDeclImpl_tmp.java 


echo "  @Override
  public String toString()
  {
    return \"int p_\"+this.name+\" = \" + this.val.getVal().split(\"\\\%\")[0];
  }

} //ModifiedPourcentDeclImpl toString added" >> PourcentDeclImpl_tmp.java
mv PourcentDeclImpl_tmp.java PourcentDeclImpl.java 

#SecondeDeclImpl
head -n $(( $(wc -l SecondeDeclImpl.java | awk '{print $1}') - 2 )) SecondeDeclImpl.java  > SecondeDeclImpl_tmp.java 
echo "  @Override
  public String toString()
  {
    return \"int s_\"+this.name+\" = \" +this.val.getVal();
  }

} //ModifiedSecondeDeclImpl toString added" >> SecondeDeclImpl_tmp.java
mv SecondeDeclImpl_tmp.java SecondeDeclImpl.java

##Case of RefSecondeVarImpl
head -n $(( $(wc -l RefSecondeVarImpl.java | awk '{print $1}') - 2 )) RefSecondeVarImpl.java  > RefSecondeVarImpl_tmp.java 
echo "  @Override
  public String toString()
  {
    return this.var.getVal().getVal();
  }

} //ModifiedRefSecondeVarImpll toString added" >> RefSecondeVarImpl_tmp.java
mv RefSecondeVarImpl_tmp.java RefSecondeVarImpl.java

##Case of RefPourcentVarImpl
head -n $(( $(wc -l RefPourcentVarImpl.java | awk '{print $1}') - 2 )) RefPourcentVarImpl.java  > RefPourcentVarImpl_tmp.java 
echo "  @Override
  public String toString()
  {
    return this.var.getVal().getVal().split(\"\\\%\")[0];
  }

} //ModifiedRefPourcentVarImpll toString added" >> RefPourcentVarImpl_tmp.java
mv RefPourcentVarImpl_tmp.java RefPourcentVarImpl.java











## Case of landing AtterrirImpl.java
head -n $(( $(wc -l AtterrirImpl.java | awk '{print $1}') - 13 )) AtterrirImpl.java > "AtterrirImpl_tmp.java"
  
echo  "  @Override
    public String toString() {
  	  return \"new Atterrir().execute(runtime);\";
    }

} //ModifiedAtterrirImpl toString added" >> "AtterrirImpl_tmp.java"
mv "AtterrirImpl_tmp.java" "AtterrirImpl.java"
  
echo "done for AtterrirImpl.java"



## Case of takeoff  DecollerImpl.java
head -n $(( $(wc -l DecollerImpl.java | awk '{print $1}') - 13 )) DecollerImpl.java > "DecollerImpl_tmp.java"
  
echo  "  @Override
  public String toString() {
  	  return \"new Decoller().execute(runtime);\";
  }

} //ModifiedDecollerImpl toString added" >> "DecollerImpl_tmp.java"
mv "DecollerImpl_tmp.java" "DecollerImpl.java"
  
echo "done for DecollerImpl.java"

## Case of pause - PauseImpl.java
head -n $(( $(wc -l PauseImpl.java | awk '{print $1}') - 2 )) PauseImpl.java > "PauseImpl_tmp.java"
  
echo  "  @Override
  public String toString() {
      return \"new Pause(new Seconde(\"+this.duree+\")).execute(runtime);\";
  }

} //ModifiedPauseImpl toString added" >> "PauseImpl_tmp.java"
mv "PauseImpl_tmp.java" "PauseImpl.java"
  
echo "done for PauseImpl.java"



##Particular case for "Parallele2Impl.java" "Parallele3Impl.java" "Parallele4Impl.java" and "ParalleleImpl.java"

## Case for Parallele2Impl

head -n $(( $(wc -l Parallele2Impl.java | awk '{print $1}') - 2 )) Parallele2Impl.java > "Parallele2Impl_tmp.java"

echo "  @Override
  public String toString() {
	  
	  //Cas particulier, pas logique du tout.
	  String a= \"\", b = \"\";
	  if (this.a != null) 
		  a = this.a.toString().split(\"\\\.\")[0];
	  else
		  a = this.t.toString().split(\"\\\.\")[0];
	  if (this.b != null)
		  b = this.b.toString().split(\"\\\.\")[0];
	  else
		  b = this.t.toString().split(\"\\\.\")[0];

	  String name = Integer.toString(this.hashCode());
  
	  return \"\\tParallele p2_\"+name+\" = new Parallele();\\n\"
	  		+ \"			  p2_\"+name+\".addCommande(\"+a+\");\\n\"
	  		+ \"			  p2_\"+name+\".addCommande(\"+b+\");\\n\"
	  		+ \"\\tp2_\"+name+\".execute(runtime);\";
  }

} //ModifiedParallele2Impl toString added " >> "Parallele2Impl_tmp.java"
mv "Parallele2Impl_tmp.java" "Parallele2Impl.java"
  

echo "done for Parallele2Impl.java"





## Case for Parallele3Impl

head -n $(( $(wc -l Parallele3Impl.java | awk '{print $1}') - 2 )) Parallele3Impl.java > "Parallele3Impl_tmp.java"

echo "  @Override
  public String toString() {
	  
	  String a = super.a.toString().split(\"\\\.\")[0];
	  String b = super.b.toString().split(\"\\\.\")[0];
	  String c = this.c.toString().split(\"\\\.\")[0];
    String name = Integer.toString(this.hashCode());
    
	  return \"\\tParallele p3_\"+name+\" = new Parallele();\\n\"
	  		+ \"			  p3_\"+name+\".addCommande(\"+a+\");\\n\"
	  		+ \"			  p3_\"+name+\".addCommande(\"+b+\");\\n\"
	  		+ \"			  p3_\"+name+\".addCommande(\"+c+\");\\n\"
	  		+ \"\\tp3_\"+name+\".execute(runtime);\";
  }

} //ModifiedParallele3Impl toString added" >> "Parallele3Impl_tmp.java"
mv "Parallele3Impl_tmp.java" "Parallele3Impl.java"

echo "done for Parallele3Impl.java"







## Case for Parallele4Impl
head -n $(( $(wc -l Parallele4Impl.java | awk '{print $1}') - 2 )) Parallele4Impl.java > "Parallele4Impl_tmp.java"

echo "  @Override
   public String toString() {
 	  
  	  String a = super.a.toString().split(\"\\\.\")[0];
  	  String b = super.b.toString().split(\"\\\.\")[0];
  	  String c = this.c.toString().split(\"\\\.\")[0];
      String d = this.d.toString().split(\"\\\.\")[0];
      String name = Integer.toString(this.hashCode());

  	  return \"\\tParallele p4_\"+name+\" = new Parallele();\\n\"
  	  		+ \"			  p4_\"+name+\".addCommande(\"+a+\");\\n\"
  	  		+ \"			  p4_\"+name+\".addCommande(\"+b+\");\\n\"
  	  		+ \"			  p4_\"+name+\".addCommande(\"+c+\");\\n\"
          + \"			  p4_\"+name+\".addCommande(\"+d+\");\\n\"
  	  		+ \"\\tp4_\"+name+\".execute(runtime);\";
    }

} //ModifiedParallele4Impl toString added" >> "Parallele4Impl_tmp.java"
mv "Parallele4Impl_tmp.java" "Parallele4Impl.java"

echo "done for Parallele4Impl.java"


## Array of file
declare -a arrayFilename=( "AvancerImpl.java" "DescendreImpl.java" "DroiteImpl.java" "GaucheImpl.java" "MonterImpl.java" "ReculerImpl.java" "RotationDroiteImpl.java" "RotationGaucheImpl.java" )

impl="Impl"
tmp="_tmp.java"
java=".java"
## now loop through the above array
for filename in "${arrayFilename[@]}"
do
                  
  nameClass=${filename: : -9}
  head -n $(( $(wc -l $filename | awk '{print $1}') - 2 )) $filename  > "{$nameClass}{$Impl}{$tmp}"
  
  echo  "  @Override
    public String toString() {
  	  return \"\\tnew $nameClass(new Seconde(\"+this.duree+\"),new Pourcent(\"+this.vitesse+\")).execute(runtime);\";
    }

} //Modified$nameClass$impl toString added" >> "{$nameClass}{$Impl}{$tmp}"
  mv "{$nameClass}{$Impl}{$tmp}" "$filename"
  
  echo "done for $nameClass"
  
  
  
done























