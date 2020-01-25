package util;


import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    private static SessionFactory SESSION_FACTORY;
    private static StandardServiceRegistry registry;

    public static SessionFactory getSessionFactory(){
        if (SESSION_FACTORY == null) {
            try {
                registry = new StandardServiceRegistryBuilder()
                        .configure()
                        .build();
                MetadataSources sources = new MetadataSources(registry);
                Metadata metadata = sources.getMetadataBuilder().build();
                SESSION_FACTORY = metadata.getSessionFactoryBuilder().build();
            } catch (Exception e){
                e.printStackTrace();
                if (registry != null){
                    StandardServiceRegistryBuilder.destroy(registry);
                }
            }
        }
        return SESSION_FACTORY;
    }
    public static void shutdown() {
        if (registry != null) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }

}
