import BarCharts from "components/BarCharts";
import DataTable from "components/DataTable";
import DonutsCharts from "components/DonutsChart";
import Footer from "components/footer";
import NavBar from "components/NavBar";

function Dashboard() {
    return (
        <>
            <NavBar />
            <div className="container">

                <h1 className="text-primary py-3"> Dashboard de Vendas</h1>

                <div className="row px-3" >
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Taxa de sucesso(%)</h5>
                        <BarCharts />
                    </div>
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary" >Todas as Vendas</h5>
                        <DonutsCharts />
                    </div>
                </div>
                <div className="PY-3">
                    <h2 className="text-primary">Todas Vendas</h2>
                </div>
                <DataTable />
            </div>
            <Footer></Footer>
        </>
    );
}

export default Dashboard;