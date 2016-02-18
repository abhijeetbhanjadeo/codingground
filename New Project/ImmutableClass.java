import java.util.*;
public final class ImmutableClass{
final List<Integer> pan;

public ImmutableClass(List<Integer> pan){
this.pan=pan;
}

public List<Integer> getPan(){
return pan;
}

public int getPanAtIndex(int idx){
return pan.get(idx);
}


}

