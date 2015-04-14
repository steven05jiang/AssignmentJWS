package edu.neu.site.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.neu.site.models.Site;


@Path("/site")
public class SiteDAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("AssignmentJWS");
	//EntityManager em = factory.createEntityManager();
	EntityManager em = factory.createEntityManager();
	
	//crud
	//createSite
	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Site> create(Site site){
		SiteDAO dao = new SiteDAO();
		em.getTransaction().begin();
		em.persist(site);
		em.getTransaction().commit();
		return dao.readAll();
	}
	
	//readSiteById
	@GET
	@Path("/{ID}")
	@Produces(MediaType.APPLICATION_JSON)
	public Site read(@PathParam("ID") int siteId){
		return em.find(Site.class, siteId);
	}
	
	//readAllSite
	@SuppressWarnings("unchecked")
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Site> readAll(){
		Query query = em.createQuery("select site from Site site");
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Site> readA(){
		List<Site> sites = new ArrayList<Site>();
		em = factory.createEntityManager();
		Query query = em.createQuery("select site from Site site");
		sites = (List<Site>)query.getResultList();
		em.close();
		return sites;
	}
	
	//updateSite
	@PUT
	@Path("/{ID}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Site> update(@PathParam("ID") int siteId, Site site){
		SiteDAO dao = new SiteDAO();
		em.getTransaction().begin();
		site.setId(siteId);
		em.merge(site);
		em.getTransaction().commit();
		return dao.readAll();
	}
	
	//deleteSite
	@DELETE
	@Path("/")
	@Consumes("application/x-www-form-urlencoded")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Site> delete(String idStr){
		int id = Integer.parseInt(idStr);
		SiteDAO dao = new SiteDAO();
		return dao.remove(id);
	}
	
	
	//removeSite
	public List<Site> remove(int id){
		SiteDAO dao = new SiteDAO();
		em.getTransaction().begin();
		Site site = em.find(Site.class, id);
		em.remove(site);
		em.getTransaction().commit();
		return dao.readAll();
	}
}
