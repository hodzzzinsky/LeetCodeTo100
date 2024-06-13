Be aware:

Not a pointer

    slow = slow.next    <- this is an example of slow being changed

a Pointer

    slow.next = slow.next.next <- ref changes original link of slow.next to slow.next.next 
                                  that leads to Mutation of original Linked list Node