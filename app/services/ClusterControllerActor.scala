package services

import akka.actor.Actor
import akka.cluster.Cluster
import akka.cluster.ClusterEvent.InitialStateAsEvents
import akka.cluster.ClusterEvent.MemberEvent
import akka.cluster.ClusterEvent.UnreachableMember
import akka.cluster.ClusterEvent.MemberUp
import akka.cluster.ClusterEvent.MemberRemoved
import akka.actor.ActorLogging
import akka.actor.typed.javadsl.Behaviors
import akka.cluster.MemberStatus.Up
import akka.cluster.MemberStatus.Removed
import akka.cluster.typed.Subscribe

object ClusterControllerActor {

  

  
  def receive() =
    Behaviors.setup[MemberEvent] { context =>


      val cluster = akka.cluster.typed.Cluster(context.getSystem)
       
      cluster.subscriptions ! Subscribe(context.getSelf, classOf[MemberEvent])

      Behaviors.receiveMessage[MemberEvent] { msg =>
        msg match {
          case x: MemberEvent =>
            println("Member evernt listener ........" + x.member.status)
            x.member.status match {
              case Up =>
                println("Member is Up: {}", x.member.address)
                akka.actor.typed.scaladsl.Behaviors.same
              
              case Removed =>
                println(
                  "Member is Removed: {} after {}",
                  x.member.address
                
                )
                
            }
            akka.actor.typed.scaladsl.Behaviors.same
        }
      }

    }

}
