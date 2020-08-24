import com.google.inject.AbstractModule
import play.api.libs.concurrent.AkkaGuiceSupport
import services.ClusterControllerActor

class Module extends AbstractModule with AkkaGuiceSupport {
  override def configure(): Unit = {

    bindTypedActor(ClusterControllerActor.receive(),"ClusterControllerActor")
   
  }
}
