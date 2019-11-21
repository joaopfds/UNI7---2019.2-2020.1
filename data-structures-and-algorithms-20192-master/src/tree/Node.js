class Node {
    constructor(key, parent = null) {
        this.key = key
        this.parent = parent
        this.leftChild = null
        this.rightChild = null
    }

    depth() {
        if (this.isRoot())
            return 0
        else
            return this.parent.depth() + 1
    }

    height() {
        if (this.isLeaf()){
            return 0
        }else{

            let altura
      
            if(this.hasBothChildren()){
                altura = 1 + Math.max(this.leftChild.height(),this.rightChild.height()) 
            }else if(this.hasRightChild()){
                altura = 1 + this.rightChild.height()
            }else if(this.hasLeftChild()){
                altura = 1 + this.leftChild.height()
            }

            return altura
            
        }
    }

    isRoot() {
        return this.parent == null
    }

    isLeaf() {
        return !this.leftChild && !this.rightChild
    }

    hasRightChild() {
        return this.rightChild != null
    }

    hasLeftChild() {
        return this.leftChild != null
    }

    hasBothChildren() {
        return this.leftChild && this.rightChild
    }

    isLeftChild() {
        return this.parent && this.parent.leftChild === this 
    }

    isRightChild() {
        return this.parent && this.parent.rightChild === this

    }
}

export default Node