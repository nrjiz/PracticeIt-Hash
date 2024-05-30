public boolean containsAll(HashIntSet set){
    
    for(int i = 0; i < set.elementData.length;i++){
        
        Node node = set.elementData[i];
        while(node!=null){
            if(!this.contains(node.data))return false;
               node=node.next;
        }
    }
    return true;
}
