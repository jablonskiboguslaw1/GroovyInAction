


import groovy.transform.ToString



@ToString(includeNames = true)
class Section {
    String title
    List<Chapter> chapters = []

}

@ToString(includeNames = true)
class Chapter {
    String title
}

@ToString(includeNames = true)
class Book {
    String title
    String summary
    List<Section> sections = []
}

//Java style
/*public Book createBook() {
    Book b = new Book();
    b.setTitle("My book");
    b.setSummary("My summary");

    Section s = new Section();
    s.setTitle("Section1");

    Chapter c1 = new Chapter();
    c1.setTitle("Chapter 1");
    Chapter c2 = new Chapter();
    c2.setTitle("Chapter 2");

    s.addChapters(c1, c2);
    b.getSection().add(s);
    return book;*/

ObjectGraphBuilder builder = new ObjectGraphBuilder()

def book = builder.book(
        title: "Groovy in Action", summary: "Second Edition") {
    section(title: "Section1") {
        chapter(title: "Chapter 1")
        chapter(title: "Chapter 2")
        chapter(title: "Chapter 3")
    }
    section(title: "Section 2") {
        chapter(title: "Chapter 4")
        chapter(title: "Chapter 5")
        chapter(title: "Chapter 6")
    }
}

println book