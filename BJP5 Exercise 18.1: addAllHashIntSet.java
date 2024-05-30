public void addAll(HashIntSet set){
    
    for(int i = 0 ; i < set.elementData.length;i++){
        
        Node node = set.elementData[i];
        while(node!=null){
            if(!this.contains(node.data)){
                this.add(node.data);
            }
            node=node.next;
        }
    }
}
